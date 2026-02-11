
PN = "fuse-overlayfs"
PE = "0"
PV = "1.14"
PR = "2.el10"
PACKAGES = "fuse-overlayfs"


URI_fuse-overlayfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fuse-overlayfs-1.14-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse-overlayfs = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) fuse3 ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) kmod ( ) libfuse3.so.3(FUSE_3.2)(64bit) ( )"
RPROVIDES:fuse-overlayfs = "fuse-overlayfs ( =  1.14-2.el10) fuse-overlayfs(x86-64) ( =  1.14-2.el10)"
