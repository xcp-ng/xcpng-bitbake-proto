
inherit dnf-bridge

PN = "librhsm"
PE = "0"
PV = "0.0.3"
PR = "16.el10"
PACKAGES = "librhsm librhsm-devel"


URI_librhsm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librhsm-0.0.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librhsm = " \
 openssl-libs \
 libgcc \
 json-glib \
 glib2 \
 glibc \
"

URI_librhsm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librhsm-devel-0.0.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librhsm-devel = " \
 json-glib-devel \
 glib2-devel \
 pkgconf-pkg-config \
 openssl-devel \
 librhsm \
"
