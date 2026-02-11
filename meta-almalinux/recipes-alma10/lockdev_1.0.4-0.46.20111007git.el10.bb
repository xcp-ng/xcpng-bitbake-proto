
PN = "lockdev"
PE = "0"
PV = "1.0.4"
PR = "0.46.20111007git.el10"
PACKAGES = "lockdev lockdev-devel"


URI_lockdev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lockdev-1.0.4-0.46.20111007git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lockdev = "glibc ( ) /bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) systemd ( )"
RPROVIDES:lockdev = "liblockdev.so.1()(64bit) ( ) lockdev ( =  1.0.4-0.46.20111007git.el10) lockdev(x86-64) ( =  1.0.4-0.46.20111007git.el10)"

URI_lockdev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lockdev-devel-1.0.4-0.46.20111007git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lockdev-devel = "/usr/bin/pkg-config ( ) liblockdev.so.1()(64bit) ( ) lockdev ( =  1.0.4-0.46.20111007git.el10)"
RPROVIDES:lockdev-devel = "lockdev-devel ( =  1.0.4-0.46.20111007git.el10) lockdev-devel(x86-64) ( =  1.0.4-0.46.20111007git.el10) pkgconfig(lockdev) ( =  1.0.4)"
