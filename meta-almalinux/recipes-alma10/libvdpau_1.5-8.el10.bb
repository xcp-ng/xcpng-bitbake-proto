
inherit dnf-bridge

PN = "libvdpau"
PE = "0"
PV = "1.5"
PR = "8.el10"
PACKAGES = "libvdpau libvdpau-trace libvdpau-devel libvdpau-docs"


URI_libvdpau = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvdpau-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau = " \
 glibc \
 libX11 \
 libXext \
"

URI_libvdpau-trace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvdpau-trace-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau-trace = " \
 glibc \
 libvdpau \
"

URI_libvdpau-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvdpau-devel-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau-devel = " \
 libX11-devel \
 libvdpau \
 libvdpau-trace \
 pkgconf-pkg-config \
"

URI_libvdpau-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvdpau-docs-1.5-8.el10.noarch.rpm;unpack=0"
RDEPENDS:libvdpau-docs = ""
