
PN = "lm_sensors"
PE = "0"
PV = "3.6.0"
PR = "20.el10"
PACKAGES = "lm_sensors lm_sensors-devel lm_sensors-libs lm_sensors-sensord"


URI_lm_sensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) perl(strict) ( ) /usr/bin/bash ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) libsensors.so.4()(64bit) ( ) /usr/sbin/modprobe ( ) /usr/sbin/dmidecode ( ) perl(:VERSION) ( >=  5.4.0) lm_sensors-libs(x86-64) ( =  3.6.0-20.el10)"
RPROVIDES:lm_sensors = "lm_sensors ( =  3.6.0-20.el10) config(lm_sensors) ( =  3.6.0-20.el10) lm_sensors(x86-64) ( =  3.6.0-20.el10)"

URI_lm_sensors-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-devel-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-devel = "libsensors.so.4()(64bit) ( ) lm_sensors-libs ( =  3.6.0-20.el10)"
RPROVIDES:lm_sensors-devel = "lm_sensors-devel ( =  3.6.0-20.el10) lm_sensors-devel(x86-64) ( =  3.6.0-20.el10)"

URI_lm_sensors-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-libs-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:lm_sensors-libs = "libsensors.so.4()(64bit) ( ) lm_sensors-libs(x86-64) ( =  3.6.0-20.el10) lm_sensors-libs ( =  3.6.0-20.el10)"

URI_lm_sensors-sensord = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lm_sensors-sensord-3.6.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lm_sensors-sensord = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libsensors.so.4()(64bit) ( ) librrd.so.8()(64bit) ( ) lm_sensors-libs(x86-64) ( =  3.6.0-20.el10) lm_sensors ( =  3.6.0-20.el10)"
RPROVIDES:lm_sensors-sensord = "config(lm_sensors-sensord) ( =  3.6.0-20.el10) lm_sensors-sensord ( =  3.6.0-20.el10) lm_sensors-sensord(x86-64) ( =  3.6.0-20.el10)"
