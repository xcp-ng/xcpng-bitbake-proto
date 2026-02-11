
inherit dnf-bridge

PN = "xdp-tools"
PE = "0"
PV = "1.5.5"
PR = "1.el10_0"
PACKAGES = "libxdp xdp-tools libxdp-devel libxdp-static"


URI_libxdp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxdp-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp = " \
 glibc \
 libbpf \
"

URI_xdp-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdp-tools-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdp-tools = " \
 libpcap \
 libbpf \
 bash \
 glibc \
 libxdp \
"

URI_libxdp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxdp-devel-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp-devel = " \
 libbpf-devel \
 libxdp \
 kernel-headers \
 pkgconf-pkg-config \
"

URI_libxdp-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxdp-static-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp-static = " \
 libxdp-devel \
"
