
inherit dnf-bridge

PN = "libxmlb"
PE = "0"
PV = "0.3.15"
PR = "7.el10"
PACKAGES = "libxmlb libxmlb-devel libxmlb-tests"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libxmlb-0.3.15-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libxmlb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libxmlb-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxmlb}"
RDEPENDS:libxmlb = " \
 shared-mime-info \
 libgcc \
 libzstd \
 glib2 \
 glibc \
 xz-libs \
"

URI_libxmlb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxmlb-devel-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxmlb-devel}"
RDEPENDS:libxmlb-devel = " \
 xz-devel \
 glib2-devel \
 libzstd-devel \
 pkgconf-pkg-config \
 libxmlb \
"

URI_libxmlb-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxmlb-tests-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxmlb-tests}"
RDEPENDS:libxmlb-tests = " \
 libgcc \
 libzstd \
 glib2 \
 glibc \
 xz-libs \
"
