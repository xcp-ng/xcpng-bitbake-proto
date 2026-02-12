
inherit dnf-bridge

PN = "libpq"
PE = "0"
PV = "16.8"
PR = "2.el10_0"
PACKAGES = "libpq libpq-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libpq-16.8-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpq = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpq-16.8-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpq}"
RDEPENDS:libpq = " \
 glibc \
 krb5-libs \
 openssl-libs \
 openldap \
"

URI_libpq-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpq-devel-16.8-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpq-devel}"
RDEPENDS:libpq-devel = " \
 glibc \
 openssl-devel \
 pkgconf-pkg-config \
 libpq \
"
