
PN = "libXdmcp"
PE = "0"
PV = "1.1.4"
PR = "5.el10"
PACKAGES = "libXdmcp libXdmcp-devel"


URI_libXdmcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdmcp-1.1.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdmcp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.36)(64bit) ( )"
RPROVIDES:libXdmcp = "libXdmcp.so.6()(64bit) ( ) libXdmcp ( =  1.1.4-5.el10) libXdmcp(x86-64) ( =  1.1.4-5.el10)"

URI_libXdmcp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXdmcp-devel-1.1.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdmcp-devel = "/usr/bin/pkg-config ( ) pkgconfig(xproto) ( ) libXdmcp.so.6()(64bit) ( ) libXdmcp ( =  1.1.4-5.el10)"
RPROVIDES:libXdmcp-devel = "libXdmcp-devel ( =  1.1.4-5.el10) libXdmcp-devel(x86-64) ( =  1.1.4-5.el10) pkgconfig(xdmcp) ( =  1.1.4)"
