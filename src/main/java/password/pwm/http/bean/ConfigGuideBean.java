/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2016 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package password.pwm.http.bean;

import password.pwm.config.value.FileValue;
import password.pwm.http.servlet.configguide.ConfigGuideForm;
import password.pwm.http.servlet.configguide.GuideStep;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConfigGuideBean extends PwmSessionBean {

    private GuideStep step = GuideStep.START;
    private Map<ConfigGuideForm.FormParameter,String> formData = new HashMap<>(ConfigGuideForm.defaultForm());
    private X509Certificate[] ldapCertificates;
    private boolean certsTrustedbyKeystore = false;
    private boolean useConfiguredCerts = false;
    private FileValue databaseDriver = null;

    public GuideStep getStep() {
        return step;
    }

    public void setStep(GuideStep step) {
        this.step = step;
    }

    public Map<ConfigGuideForm.FormParameter, String> getFormData() {
        return formData;
    }

    public void setFormData(Map<ConfigGuideForm.FormParameter, String> formData) {
        this.formData = formData;
    }

    public X509Certificate[] getLdapCertificates() {
        return ldapCertificates;
    }

    public void setLdapCertificates(X509Certificate[] ldapCertificates) {
        this.ldapCertificates = ldapCertificates;
    }

    public boolean isCertsTrustedbyKeystore() {
        return certsTrustedbyKeystore;
    }

    public void setCertsTrustedbyKeystore(boolean certsTrustedbyKeystore) {
        this.certsTrustedbyKeystore = certsTrustedbyKeystore;
    }

    public boolean isUseConfiguredCerts() {
        return useConfiguredCerts;
    }

    public void setUseConfiguredCerts(boolean useConfiguredCerts) {
        this.useConfiguredCerts = useConfiguredCerts;
    }

    public FileValue getDatabaseDriver() {
        return databaseDriver;
    }

    public void setDatabaseDriver(FileValue databaseDriver) {
        this.databaseDriver = databaseDriver;
    }

    public Type getType() {
        return Type.PUBLIC;
    }

    public Set<Flag> getFlags() {
        return Collections.singleton(Flag.ProhibitCookieSession);
    }
}
