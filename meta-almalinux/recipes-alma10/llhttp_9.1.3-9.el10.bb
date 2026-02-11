
PN = "llhttp"
PE = "0"
PV = "9.1.3"
PR = "9.el10"
PACKAGES = "llhttp llhttp-devel"


URI_llhttp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/llhttp-9.1.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:llhttp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.3.4)(64bit) ( )"
RPROVIDES:llhttp = "libllhttp.so.9.1()(64bit) ( ) llhttp ( =  9.1.3-9.el10) llhttp(x86-64) ( =  9.1.3-9.el10)"

URI_llhttp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/llhttp-devel-9.1.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:llhttp-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libllhttp.so.9.1()(64bit) ( ) llhttp(x86-64) ( =  9.1.3-9.el10)"
RPROVIDES:llhttp-devel = "cmake(llhttp) ( ) llhttp-devel ( =  9.1.3-9.el10) llhttp-devel(x86-64) ( =  9.1.3-9.el10) pkgconfig(libllhttp) ( =  9.1.3)"
