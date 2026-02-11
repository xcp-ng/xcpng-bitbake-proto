
PN = "rsync"
PE = "0"
PV = "3.4.1"
PR = "2.el10"
PACKAGES = "rsync rsync-daemon rsync-rrsync"


URI_rsync = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rsync-3.4.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsync = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libpopt.so.0()(64bit) ( ) /usr/bin/bash ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libacl.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) liblz4.so.1()(64bit) ( )"
RPROVIDES:rsync = "bundled(zlib) ( =  1.2.8) config(rsync) ( =  3.4.1-2.el10) rsync ( =  3.4.1-2.el10) rsync(x86-64) ( =  3.4.1-2.el10)"

URI_rsync-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsync-daemon-3.4.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:rsync-daemon = "/bin/sh ( ) systemd ( ) rsync ( =  3.4.1-2.el10)"
RPROVIDES:rsync-daemon = "config(rsync-daemon) ( =  3.4.1-2.el10) rsync-daemon ( =  3.4.1-2.el10)"

URI_rsync-rrsync = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsync-rrsync-3.4.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:rsync-rrsync = "/usr/bin/python3 ( ) rsync ( =  3.4.1-2.el10)"
RPROVIDES:rsync-rrsync = "rsync-rrsync ( =  3.4.1-2.el10)"
