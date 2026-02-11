
PN = "ksmtuned"
PE = "0"
PV = "0.1.0"
PR = "16.el10"
PACKAGES = "ksmtuned"


URI_ksmtuned = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ksmtuned-0.1.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ksmtuned = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( )"
RPROVIDES:ksmtuned = "config(ksmtuned) ( =  0.1.0-16.el10) ksmtuned ( =  0.1.0-16.el10) ksmtuned(x86-64) ( =  0.1.0-16.el10)"
