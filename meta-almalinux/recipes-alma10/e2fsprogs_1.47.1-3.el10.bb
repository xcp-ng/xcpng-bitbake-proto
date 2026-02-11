
PN = "e2fsprogs"
PE = "0"
PV = "1.47.1"
PR = "3.el10"
PACKAGES = "e2fsprogs e2fsprogs-libs libcom_err libss e2fsprogs-devel libcom_err-devel e2fsprogs-static e2scrub libss-devel"


URI_e2fsprogs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/e2fsprogs-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) libss.so.2()(64bit) ( ) libblkid.so.1(BLKID_1.0)(64bit) ( ) libext2fs.so.2()(64bit) ( ) libfuse3.so.3()(64bit) ( ) libe2p.so.2()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libblkid.so.1(BLKID_2_36)(64bit) ( ) libcom_err(x86-64) ( =  1.47.1-3.el10) e2fsprogs-libs(x86-64) ( =  1.47.1-3.el10) libss ( =  1.47.1-3.el10)"
RPROVIDES:e2fsprogs = "config(e2fsprogs) ( =  1.47.1-3.el10) e2fsprogs ( =  1.47.1-3.el10) e2fsprogs(x86-64) ( =  1.47.1-3.el10) e4fsprogs ( =  1.47.1-3.el10)"

URI_e2fsprogs-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/e2fsprogs-libs-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libcom_err(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:e2fsprogs-libs = "libext2fs.so.2()(64bit) ( ) libe2p.so.2()(64bit) ( ) e2fsprogs-libs(x86-64) ( =  1.47.1-3.el10) e2fsprogs-libs ( =  1.47.1-3.el10)"

URI_libcom_err = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcom_err-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcom_err = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libcom_err = "libcom_err.so.2()(64bit) ( ) libcom_err(x86-64) ( =  1.47.1-3.el10) libcom_err ( =  1.47.1-3.el10)"

URI_libss = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libss-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libss = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libcom_err(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:libss = "libss.so.2()(64bit) ( ) libss ( =  1.47.1-3.el10) libss(x86-64) ( =  1.47.1-3.el10)"

URI_e2fsprogs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/e2fsprogs-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) gawk ( ) libe2p.so.2()(64bit) ( ) libext2fs.so.2()(64bit) ( ) pkgconfig(com_err) ( ) libcom_err-devel(x86-64) ( =  1.47.1-3.el10) e2fsprogs-libs(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:e2fsprogs-devel = "e2fsprogs-devel ( =  1.47.1-3.el10) e2fsprogs-devel(x86-64) ( =  1.47.1-3.el10) pkgconfig(e2p) ( =  1.47.1) pkgconfig(ext2fs) ( =  1.47.1)"

URI_libcom_err-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcom_err-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcom_err-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libcom_err.so.2()(64bit) ( ) libcom_err(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:libcom_err-devel = "libcom_err-devel(x86-64) ( =  1.47.1-3.el10) libcom_err-devel ( =  1.47.1-3.el10) pkgconfig(com_err) ( =  1.47.1)"

URI_e2fsprogs-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/e2fsprogs-static-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2fsprogs-static = ""
RPROVIDES:e2fsprogs-static = "e2fsprogs-static ( =  1.47.1-3.el10) e2fsprogs-static(x86-64) ( =  1.47.1-3.el10)"

URI_e2scrub = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/e2scrub-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:e2scrub = "/usr/bin/bash ( ) systemd ( ) util-linux ( ) lvm2 ( ) e2fsprogs(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:e2scrub = "config(e2scrub) ( =  1.47.1-3.el10) e2scrub ( =  1.47.1-3.el10) e2scrub(x86-64) ( =  1.47.1-3.el10)"

URI_libss-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libss-devel-1.47.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libss-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libss.so.2()(64bit) ( ) pkgconfig(com_err) ( ) libss(x86-64) ( =  1.47.1-3.el10)"
RPROVIDES:libss-devel = "libss-devel ( =  1.47.1-3.el10) libss-devel(x86-64) ( =  1.47.1-3.el10) pkgconfig(ss) ( =  1.47.1)"
