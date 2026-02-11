
PN = "erofs-utils"
PE = "0"
PV = "1.8.4"
PR = "2.el10"
PACKAGES = "erofs-fuse erofs-utils"


URI_erofs-fuse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/erofs-fuse-1.8.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:erofs-fuse = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) liblz4.so.1()(64bit) ( ) fuse3 ( ) libfuse3.so.3()(64bit) ( ) liblzma.so.5(XZ_5.4)(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) libfuse3.so.3(FUSE_3.2)(64bit) ( )"
RPROVIDES:erofs-fuse = "erofs-fuse ( =  1.8.4-2.el10) erofs-fuse(x86-64) ( =  1.8.4-2.el10)"

URI_erofs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/erofs-utils-1.8.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:erofs-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) liblz4.so.1()(64bit) ( ) liblzma.so.5(XZ_5.4)(64bit) ( )"
RPROVIDES:erofs-utils = "erofs-utils ( =  1.8.4-2.el10) erofs-utils(x86-64) ( =  1.8.4-2.el10)"
