
inherit dnf-bridge

PN = "dogtag-pki"
PE = "0"
PV = "11.6.0"
PR = "1.el10"
PACKAGES = "idm-pki-acme idm-pki-base idm-pki-ca idm-pki-java idm-pki-kra idm-pki-server idm-pki-tools python3-idm-pki idm-pki"


URI_idm-pki-acme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-acme-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-acme = " \
 bash \
 idm-pki-server \
"

URI_idm-pki-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-base-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-base = " \
 nss \
 bash \
 python3-idm-pki \
"

URI_idm-pki-ca = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-ca-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-ca = " \
 systemd \
 bash \
 idm-pki-server \
"

URI_idm-pki-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-java-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-java = " \
 httpcomponents-client \
 apache-commons-codec \
 apache-commons-cli \
 apache-commons-io \
 apache-commons-lang3 \
 apache-commons-logging \
 apache-commons-net \
 idm-jss \
 idm-ldapjdk \
 idm-pki-base \
 slf4j \
 slf4j-jdk14 \
 java-21-openjdk-headless \
"

URI_idm-pki-kra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-kra-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-kra = " \
 systemd \
 bash \
 idm-pki-server \
"

URI_idm-pki-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-server-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-pki-server = " \
 python3 \
 systemd \
 keyutils \
 policycoreutils-python-utils \
 java-21-openjdk-devel \
 python3-libselinux \
 idm-jss-tomcat \
 python3-lxml \
 idm-pki-tools \
 selinux-policy-targeted \
 tomcat9 \
 openldap-clients \
 shadow-utils \
 openssl \
 bash \
 ipa-healthcheck-core \
 python3-policycoreutils \
 hostname \
 policycoreutils \
 procps-ng \
"

URI_idm-pki-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-pki-tools-11.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-pki-tools = " \
 nss \
 openssl \
 libgcc \
 p11-kit-trust \
 nss-tools \
 libstdc++ \
 bash \
 idm-pki-java \
 glibc \
 file \
 openldap \
 openldap-clients \
 nspr \
"

URI_python3-idm-pki = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-idm-pki-11.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-idm-pki = " \
 python3 \
 python3-ldap \
 python3-requests \
 python3-cryptography \
 python3-six \
 idm-pki-base \
 python3-lxml \
"

URI_idm-pki = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-pki-11.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-pki = " \
 python3-idm-pki \
 idm-pki-acme \
 idm-pki-base \
 idm-pki-ca \
 idm-pki-java \
 idm-pki-kra \
 idm-pki-server \
 idm-pki-tools \
"
