
inherit dnf-bridge

PN = "munge"
PE = "0"
PV = "0.5.15"
PR = "10.el10"
PACKAGES = "munge munge-libs munge-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/munge-0.5.15-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_munge = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/munge-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_munge}"
RDEPENDS:munge = " \
 logrotate \
 shadow-utils \
 systemd \
 zlib-ng-compat \
 bzip2-libs \
 libgcc \
 openssl-libs \
 munge-libs \
 bash \
 glibc \
"

URI_munge-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/munge-libs-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_munge-libs}"
RDEPENDS:munge-libs = " \
 glibc \
"

URI_munge-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/munge-devel-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_munge-devel}"
RDEPENDS:munge-devel = " \
 munge-libs \
 pkgconf-pkg-config \
"
