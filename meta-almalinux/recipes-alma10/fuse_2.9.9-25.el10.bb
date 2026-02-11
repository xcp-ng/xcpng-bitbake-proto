
PN = "fuse"
PE = "0"
PV = "2.9.9"
PR = "25.el10"
PACKAGES = "fuse fuse-libs fuse-devel"


URI_fuse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) which ( ) fuse-common ( >=  3.4.2-4)"
RPROVIDES:fuse = "fuse ( =  2.9.9-25.el10) fuse(x86-64) ( =  2.9.9-25.el10)"

URI_fuse-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-libs-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:fuse-libs = "libfuse.so.2()(64bit) ( ) libfuse.so.2(FUSE_2.6)(64bit) ( ) libfuse.so.2(FUSE_2.2)(64bit) ( ) libfuse.so.2(FUSE_2.4)(64bit) ( ) libfuse.so.2(FUSE_2.5)(64bit) ( ) libfuse.so.2(FUSE_2.7)(64bit) ( ) libfuse.so.2(FUSE_2.7.5)(64bit) ( ) libfuse.so.2(FUSE_2.8)(64bit) ( ) libfuse.so.2(FUSE_2.9)(64bit) ( ) libfuse.so.2(FUSE_2.9.1)(64bit) ( ) libulockmgr.so.1()(64bit) ( ) fuse-libs ( =  2.9.9-25.el10) fuse-libs(x86-64) ( =  2.9.9-25.el10)"

URI_fuse-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fuse-devel-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libfuse.so.2()(64bit) ( ) libulockmgr.so.1()(64bit) ( ) fuse-libs ( =  2.9.9-25.el10)"
RPROVIDES:fuse-devel = "fuse-devel ( =  2.9.9-25.el10) fuse-devel(x86-64) ( =  2.9.9-25.el10) pkgconfig(fuse) ( =  2.9.9)"
