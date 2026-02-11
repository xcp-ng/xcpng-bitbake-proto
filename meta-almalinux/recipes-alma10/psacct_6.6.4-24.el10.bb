
PN = "psacct"
PE = "0"
PV = "6.6.4"
PR = "24.el10"
PACKAGES = "psacct"


URI_psacct = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/psacct-6.6.4-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:psacct = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) /usr/bin/sh ( )"
RPROVIDES:psacct = "config(psacct) ( =  6.6.4-24.el10) psacct ( =  6.6.4-24.el10) psacct(x86-64) ( =  6.6.4-24.el10)"
