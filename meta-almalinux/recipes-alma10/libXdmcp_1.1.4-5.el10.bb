
PN = "libXdmcp"
PE = "0"
PV = "1.1.4"
PR = "5.el10"
PACKAGES = "libXdmcp libXdmcp-devel"


URI_libXdmcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdmcp-1.1.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdmcp = "
 glibc
"

URI_libXdmcp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXdmcp-devel-1.1.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdmcp-devel = "
 xorg-x11-proto-devel
 pkgconf-pkg-config
 libXdmcp
"
