
inherit dnf-bridge

PN = "ledmon"
PE = "0"
PV = "1.1.0"
PR = "1.el10_0.1"
PACKAGES = "ledmon ledmon-libs ledmon-devel"


URI_ledmon = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ledmon-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon = " \
 sg3_utils-libs \
 systemd-libs \
 pciutils-libs \
 bash \
 glibc \
"

URI_ledmon-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ledmon-libs-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon-libs = " \
 glibc \
 sg3_utils-libs \
 pciutils-libs \
"

URI_ledmon-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ledmon-devel-1.1.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ledmon-devel = " \
 sg3_utils-devel \
 pkgconf-pkg-config \
 ledmon-libs \
 pciutils-devel \
"
