
PN = "watchdog"
PE = "0"
PV = "5.16"
PR = "11.el10"
PACKAGES = "watchdog"


URI_watchdog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/watchdog-5.16-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:watchdog = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:watchdog = "config(watchdog) ( =  5.16-11.el10) watchdog ( =  5.16-11.el10) watchdog(x86-64) ( =  5.16-11.el10)"
