
PN = "dogtag-pki"
PE = "0"
PV = "11.6.0"
PR = "1.el10"
PACKAGES = "idm-pki-acme idm-pki-base idm-pki-ca idm-pki-java idm-pki-kra idm-pki-server idm-pki-tools python3-idm-pki idm-pki"


URI_idm-pki-acme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-acme-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-acme = "/usr/bin/sh ( ) idm-pki-server ( =  11.6.0-1.el10)"
RPROVIDES:idm-pki-acme = "idm-pki-acme ( =  11.6.0-1.el10) pki-acme ( =  11.6.0-1.el10)"

URI_idm-pki-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-base-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-base = "/bin/sh ( ) python3-pki ( =  11.6.0-1.el10) /usr/bin/sh ( ) nss ( >=  3.36.1)"
RPROVIDES:idm-pki-base = "idm-pki-base ( =  11.6.0-1.el10) config(idm-pki-base) ( =  11.6.0-1.el10) pki-base ( =  11.6.0-1.el10)"

URI_idm-pki-ca = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-ca-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-ca = "systemd-units ( ) /usr/bin/sh ( ) idm-pki-server ( =  11.6.0-1.el10)"
RPROVIDES:idm-pki-ca = "idm-pki-ca ( =  11.6.0-1.el10) pki-ca ( =  11.6.0-1.el10)"

URI_idm-pki-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-java-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-java = "mvn(org.slf4j:slf4j-api) ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(commons-codec:commons-codec) ( ) mvn(commons-io:commons-io) ( ) mvn(commons-logging:commons-logging) ( ) mvn(org.apache.httpcomponents:httpclient) ( ) mvn(org.slf4j:slf4j-jdk14) ( ) mvn(commons-cli:commons-cli) ( ) mvn(commons-net:commons-net) ( ) idm-pki-base ( =  11.6.0-1.el10) mvn(org.dogtagpki.jss:jss-base) ( >=  5.6.0) java-headless ( >=  1:17) mvn(org.dogtagpki.ldap-sdk:ldapjdk) ( >=  5.6.0)"
RPROVIDES:idm-pki-java = "idm-pki-java ( =  11.6.0-1.el10) osgi(jakarta.activation-api) ( =  2.1.2) osgi(jakarta.annotation-api) ( =  1.3.5) osgi(jakarta.xml.bind-api) ( =  4.0.1) bundled(jackson-annotations) ( =  2.16.1) bundled(jackson-core) ( =  2.16.1) bundled(jackson-databind) ( =  2.16.1) bundled(jackson-jaxrs-providers) ( =  2.16.1) bundled(jackson-modules-base) ( =  2.16.1) bundled(jakarta-activation) ( =  2.1.2) bundled(jakarta-annotations) ( =  1.3.5) bundled(jaxb-api) ( =  4.0.1) bundled(jboss-jaxrs-2.0-api) ( =  1.0.0) bundled(jboss-logging) ( =  3.5.3) bundled(resteasy-client) ( =  3.0.26) bundled(resteasy-jackson2-provider) ( =  3.0.26) bundled(resteasy-jaxrs) ( =  3.0.26) idm-pki-base-java ( =  11.6.0-1.el10) osgi(com.fasterxml.jackson.core.jackson-annotations) ( =  2.16.1) osgi(com.fasterxml.jackson.core.jackson-core) ( =  2.16.1) osgi(com.fasterxml.jackson.core.jackson-databind) ( =  2.16.1) osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-base) ( =  2.16.1) osgi(com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider) ( =  2.16.1) osgi(com.fasterxml.jackson.module.jackson-module-jaxb-annotations) ( =  2.16.1) osgi(org.jboss.logging.jboss-logging) ( =  3.5.3) osgi(org.jboss.spec.javax.ws.rs.jboss-jaxrs-api_2.0_spec) ( =  1.0.0) pki-base-java ( =  11.6.0-1.el10)"

URI_idm-pki-kra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-kra-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-kra = "systemd-units ( ) /usr/bin/sh ( ) idm-pki-server ( =  11.6.0-1.el10)"
RPROVIDES:idm-pki-kra = "idm-pki-kra ( =  11.6.0-1.el10) pki-kra ( =  11.6.0-1.el10)"

URI_idm-pki-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-server-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-server = "/bin/sh ( ) shadow-utils ( ) systemd-units ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) systemd ( ) policycoreutils ( ) policycoreutils-python-utils ( ) openssl ( ) python3-libselinux ( ) python3-lxml ( ) hostname ( ) openldap-clients ( ) procps-ng ( ) python3-policycoreutils ( ) keyutils ( ) ipa-healthcheck-core ( ) python(abi) ( =  3.12) tomcat9 ( >=  1:9.0.62) idm-pki-tools ( =  11.6.0-1.el10) java-devel ( >=  1:17) mvn(org.dogtagpki.jss:jss-tomcat) ( >=  5.6.0) selinux-policy-targeted ( >=  3.13.1-159)"
RPROVIDES:idm-pki-server = "idm-pki-server ( =  11.6.0-1.el10) bundled(js-backbone) ( =  1.4.0) bundled(js-bootstrap) ( =  3.4.1) bundled(js-jquery) ( =  3.5.1) bundled(js-jquery-i18n-properties) ( =  1.2.7) bundled(js-patternfly) ( =  3.59.2) bundled(js-underscore) ( =  1.9.2) bundled(resteasy-servlet-initializer) ( =  3.0.26) config(idm-pki-server) ( =  11.6.0-1.el10) pki-server ( =  11.6.0-1.el10) python3.12dist(pkihealthcheck) ( =  0.1) python3dist(pkihealthcheck) ( =  0.1)"

URI_idm-pki-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-tools-11.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-pki-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/bash ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libplds4.so()(64bit) ( ) libsmime3.so()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libnss3.so(NSS_3.9.2)(64bit) ( ) libnss3.so(NSS_3.12)(64bit) ( ) libnss3.so(NSS_3.3)(64bit) ( ) libsmime3.so(NSS_3.4)(64bit) ( ) libnss3.so(NSS_3.5)(64bit) ( ) openssl ( ) libnss3.so(NSS_3.10)(64bit) ( ) libnss3.so(NSS_3.6)(64bit) ( ) libnss3.so(NSS_3.9)(64bit) ( ) libsmime3.so(NSS_3.2)(64bit) ( ) liblber.so.2()(64bit) ( ) libnss3.so(NSS_3.7)(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) p11-kit-trust ( ) libnss3.so(NSS_3.10.2)(64bit) ( ) nss-tools ( ) file ( ) openldap-clients ( ) idm-pki-java ( =  11.6.0-1.el10) nss-tools ( >=  3.36.1)"
RPROVIDES:idm-pki-tools = "idm-pki-tools ( =  11.6.0-1.el10) idm-pki-tools(x86-64) ( =  11.6.0-1.el10) pki-tools ( =  11.6.0-1.el10)"

URI_python3-idm-pki = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-idm-pki-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-idm-pki = "python3-six ( ) python3-cryptography ( ) python3-lxml ( ) python3-ldap ( ) python(abi) ( =  3.12) idm-pki-base ( =  11.6.0-1.el10) python3 ( >=  3.6) python3-requests ( >=  2.6.0)"
RPROVIDES:python3-idm-pki = "python3-pki ( =  11.6.0-1.el10) pki-base-python3 ( =  11.6.0-1.el10) python-idm-pki ( =  11.6.0-1.el10) python-pki ( =  11.6.0-1.el10) python3-idm-pki ( =  11.6.0-1.el10) python3.12-idm-pki ( =  11.6.0-1.el10) python3.12-pki ( =  11.6.0-1.el10)"

URI_idm-pki = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-pki-11.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-pki = "idm-pki-acme ( =  11.6.0-1.el10) idm-pki-server ( =  11.6.0-1.el10) idm-pki-base ( =  11.6.0-1.el10) idm-pki-ca ( =  11.6.0-1.el10) idm-pki-java ( =  11.6.0-1.el10) idm-pki-kra ( =  11.6.0-1.el10) idm-pki-tools ( =  11.6.0-1.el10) python3-idm-pki ( =  11.6.0-1.el10)"
RPROVIDES:idm-pki = "idm-pki ( =  11.6.0-1.el10) idm-pki(x86-64) ( =  11.6.0-1.el10)"
