
PN = "xfsprogs"
PE = "0"
PV = "6.11.0"
PR = "1.el10"
PACKAGES = "xfsprogs xfsprogs-devel xfsprogs-xfs_scrub"


URI_xfsprogs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/xfsprogs-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( ) liburcu.so.8()(64bit) ( ) libedit.so.0()(64bit) ( ) libinih.so.0()(64bit) ( )"
RPROVIDES:xfsprogs = "libhandle.so.1()(64bit) ( ) libhandle.so.1(LIBHANDLE_1.0.3)(64bit) ( ) xfs-cmds ( ) xfsprogs-qa-devel ( ) xfsprogs ( =  6.11.0-1.el10) xfsprogs(x86-64) ( =  6.11.0-1.el10)"

URI_xfsprogs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xfsprogs-devel-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs-devel = "libuuid-devel ( ) libhandle.so.1()(64bit) ( ) xfsprogs ( =  6.11.0-1.el10)"
RPROVIDES:xfsprogs-devel = "xfsprogs-devel ( =  6.11.0-1.el10) xfsprogs-devel(x86-64) ( =  6.11.0-1.el10)"

URI_xfsprogs-xfs_scrub = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xfsprogs-xfs_scrub-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xfsprogs-xfs_scrub = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) util-linux ( ) libicuuc.so.74()(64bit) ( ) python3 ( ) libicui18n.so.74()(64bit) ( ) liburcu.so.8()(64bit) ( ) xfsprogs ( =  6.11.0-1.el10)"
RPROVIDES:xfsprogs-xfs_scrub = "xfsprogs-xfs_scrub ( =  6.11.0-1.el10) xfsprogs-xfs_scrub(x86-64) ( =  6.11.0-1.el10)"
