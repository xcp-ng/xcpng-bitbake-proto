
PN = "libvdpau"
PE = "0"
PV = "1.5"
PR = "8.el10"
PACKAGES = "libvdpau libvdpau-trace libvdpau-devel libvdpau-docs"


URI_libvdpau = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvdpau-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( )"
RPROVIDES:libvdpau = "libvdpau.so.1()(64bit) ( ) libvdpau(x86-64) ( =  1.5-8.el10) config(libvdpau) ( =  1.5-8.el10) libvdpau ( =  1.5-8.el10)"

URI_libvdpau-trace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvdpau-trace-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau-trace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libvdpau(x86-64) ( =  1.5-8.el10)"
RPROVIDES:libvdpau-trace = "libvdpau_trace.so.1()(64bit) ( ) libvdpau-trace ( =  1.5-8.el10) libvdpau-trace(x86-64) ( =  1.5-8.el10)"

URI_libvdpau-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvdpau-devel-1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvdpau-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libX11-devel(x86-64) ( ) libvdpau.so.1()(64bit) ( ) libvdpau(x86-64) ( =  1.5-8.el10) libvdpau-trace(x86-64) ( =  1.5-8.el10)"
RPROVIDES:libvdpau-devel = "libvdpau-devel ( =  1.5-8.el10) libvdpau-devel(x86-64) ( =  1.5-8.el10) pkgconfig(vdpau) ( =  1.5)"

URI_libvdpau-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvdpau-docs-1.5-8.el10.noarch.rpm;unpack=0"
RDEPENDS:libvdpau-docs = ""
RPROVIDES:libvdpau-docs = "libvdpau-docs ( =  1.5-8.el10)"
