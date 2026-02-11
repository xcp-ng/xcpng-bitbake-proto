
inherit dnf-bridge

PN = "numactl"
PE = "0"
PV = "2.0.19"
PR = "1.el10"
PACKAGES = "numactl numactl-libs numactl-devel"


URI_numactl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numactl-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl = " \
 glibc \
 numactl-libs \
"

URI_numactl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/numactl-libs-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl-libs = " \
 glibc \
"

URI_numactl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/numactl-devel-2.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:numactl-devel = " \
 pkgconf-pkg-config \
 numactl-libs \
"
