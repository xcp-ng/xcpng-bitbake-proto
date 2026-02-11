
PN = "hwloc"
PE = "0"
PV = "2.11.1"
PR = "3.el10"
PACKAGES = "hwloc hwloc-libs hwloc-devel hwloc-gui"


URI_hwloc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hwloc-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc = " \
 systemd \
 hwloc-libs \
 bash \
 ncurses-libs \
 glibc \
"

URI_hwloc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/hwloc-libs-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-libs = " \
 libpciaccess \
 systemd-libs \
 libxml2 \
 ocl-icd \
 glibc \
"

URI_hwloc-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hwloc-devel-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-devel = " \
 libxml2-devel \
 pkgconf-pkg-config \
 libpciaccess-devel \
 hwloc-libs \
 rdma-core-devel \
"

URI_hwloc-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hwloc-gui-2.11.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hwloc-gui = " \
 libX11 \
 hwloc-libs \
 ncurses-libs \
 cairo \
 glibc \
"
