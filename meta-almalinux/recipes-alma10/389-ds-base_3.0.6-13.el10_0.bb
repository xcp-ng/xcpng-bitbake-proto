
inherit dnf-bridge

PN = "389-ds-base"
PE = "0"
PV = "3.0.6"
PR = "13.el10_0"
PACKAGES = "389-ds-base 389-ds-base-libs 389-ds-base-snmp python3-lib389 389-ds-base-bdb 389-ds-base-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/389-ds-base-3.0.6-13.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_389-ds-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/389-ds-base-3.0.6-13.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_389-ds-base}"
RDEPENDS:389-ds-base = " \
 python3 \
 systemd \
 nss \
 systemd-libs \
 policycoreutils-python-utils \
 perl-Archive-Tar \
 cyrus-sasl-gssapi \
 krb5-libs \
 cyrus-sasl-lib \
 nss-tools \
 nss-util \
 cyrus-sasl-plain \
 perl-sigtrap \
 python3-lib389 \
 json-c \
 acl \
 cyrus-sasl-md5 \
 python3-libsemanage \
 libstdc++ \
 libcom_err \
 openldap \
 openldap-clients \
 shadow-utils \
 zlib-ng-compat \
 python3-file-magic \
 libxcrypt \
 zlib-ng-compat-devel \
 libgcc \
 openssl-libs \
 pam-libs \
 bash \
 pcre2 \
 libicu \
 lmdb-libs \
 perl-debugger \
 389-ds-base-libs \
 glibc \
 perl-interpreter \
 cracklib \
 cracklib-dicts \
 nspr \
"

URI_389-ds-base-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/389-ds-base-libs-3.0.6-13.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_389-ds-base-libs}"
RDEPENDS:389-ds-base-libs = " \
 zlib-ng-compat \
 nss \
 systemd-libs \
 openssl-libs \
 libgcc \
 json-c \
 krb5-libs \
 cyrus-sasl-lib \
 libstdc++ \
 nss-util \
 pcre2 \
 libcom_err \
 cracklib \
 glibc \
 openldap \
 nspr \
"

URI_389-ds-base-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/389-ds-base-snmp-3.0.6-13.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_389-ds-base-snmp}"
RDEPENDS:389-ds-base-snmp = " \
 net-snmp-agent-libs \
 net-snmp-libs \
 389-ds-base \
 bash \
 glibc \
 openldap \
 nspr \
"

URI_python3-lib389 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-lib389-3.0.6-13.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-lib389}"
RDEPENDS:python3-lib389 = " \
 python3 \
 python3-ldap \
 python3-psutil \
 python3-cryptography \
 openssl \
 iproute \
 python3-pyasn1 \
 python3-dateutil \
 python3-pyasn1-modules \
 python3-libselinux \
 python3-setuptools \
 389-ds-base \
 openssl-perl \
 python3-distro \
 python3-argcomplete \
"

URI_389-ds-base-bdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/389-ds-base-bdb-3.0.6-13.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_389-ds-base-bdb}"
RDEPENDS:389-ds-base-bdb = " \
 zlib-ng-compat \
 nss \
 systemd-libs \
 openssl-libs \
 libgcc \
 json-c \
 openldap \
 krb5-libs \
 cyrus-sasl-lib \
 libcom_err \
 pcre2 \
 389-ds-base-libs \
 cracklib \
 389-ds-base \
 glibc \
 nss-util \
 lmdb-libs \
 nspr \
"

URI_389-ds-base-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/389-ds-base-devel-3.0.6-13.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_389-ds-base-devel}"
RDEPENDS:389-ds-base-devel = " \
 nspr-devel \
 systemd-libs \
 nss-devel \
 openldap-devel \
 pkgconf-pkg-config \
 389-ds-base-libs \
"
