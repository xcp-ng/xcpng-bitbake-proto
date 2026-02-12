
inherit dnf-bridge

PN = "openldap"
PE = "0"
PV = "2.6.8"
PR = "3.el10"
PACKAGES = "openldap openldap-clients openldap-compat openldap-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/openldap-2.6.8-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openldap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openldap}"
RDEPENDS:openldap = " \
 shadow-utils \
 libevent \
 openssl-libs \
 cyrus-sasl-lib \
 glibc \
"

URI_openldap-clients = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-clients-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openldap-clients}"
RDEPENDS:openldap-clients = " \
 glibc \
 cyrus-sasl-lib \
 openldap \
"

URI_openldap-compat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-compat-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openldap-compat}"
RDEPENDS:openldap-compat = " \
 glibc \
 openldap \
"

URI_openldap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openldap-devel-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openldap-devel}"
RDEPENDS:openldap-devel = " \
 openldap \
 cyrus-sasl-devel \
 pkgconf-pkg-config \
 openldap-devel \
"
