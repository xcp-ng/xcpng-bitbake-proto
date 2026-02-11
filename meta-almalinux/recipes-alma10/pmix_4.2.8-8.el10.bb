
PN = "pmix"
PE = "0"
PV = "4.2.8"
PR = "8.el10"
PACKAGES = "pmix pmix-devel pmix-tools"


URI_pmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libhwloc.so.15()(64bit) ( ) libevent_core-2.1.so.7()(64bit) ( ) libevent_pthreads-2.1.so.7()(64bit) ( ) libmunge.so.2()(64bit) ( )"
RPROVIDES:pmix = "libpmix.so.2()(64bit) ( ) pmix(x86-64) ( =  4.2.8-8.el10) config(pmix) ( =  4.2.8-8.el10) pmix ( =  4.2.8-8.el10)"

URI_pmix-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-devel-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix-devel = "/usr/bin/pkg-config ( ) libpmix.so.2()(64bit) ( ) pmix(x86-64) ( =  4.2.8-8.el10) pmix-tools(x86-64) ( =  4.2.8-8.el10)"
RPROVIDES:pmix-devel = "pkgconfig(pmix) ( =  4.2.8) pmix-devel ( =  4.2.8-8.el10) pmix-devel(x86-64) ( =  4.2.8-8.el10)"

URI_pmix-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pmix-tools-4.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pmix-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpmix.so.2()(64bit) ( ) pmix(x86-64) ( =  4.2.8-8.el10)"
RPROVIDES:pmix-tools = "pmix-tools(x86-64) ( =  4.2.8-8.el10) pmix-tools ( =  4.2.8-8.el10)"
