
PN = "libepoxy"
PE = "0"
PV = "1.5.10"
PR = "9.el10"
PACKAGES = "libepoxy libepoxy-devel"


URI_libepoxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libepoxy-1.5.10-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libepoxy = "
 glibc
"

URI_libepoxy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libepoxy-devel-1.5.10-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libepoxy-devel = "
 libX11-devel
 libepoxy
 pkgconf-pkg-config
 libglvnd-devel
"
