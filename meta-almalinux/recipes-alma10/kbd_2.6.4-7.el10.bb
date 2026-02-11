
PN = "kbd"
PE = "0"
PV = "2.6.4"
PR = "7.el10"
PACKAGES = "kbd kbd-legacy kbd-misc"


URI_kbd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kbd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libpam_misc.so.0()(64bit) ( ) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) ( ) kbd-legacy ( =  2.6.4-7.el10) kbd-misc ( =  2.6.4-7.el10)"
RPROVIDES:kbd = "config(kbd) ( =  2.6.4-7.el10) kbd ( =  2.6.4-7.el10) kbd(x86-64) ( =  2.6.4-7.el10) vlock ( =  2.6.4)"

URI_kbd-legacy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-legacy-2.6.4-7.el10.noarch.rpm;unpack=0"
RDEPENDS:kbd-legacy = ""
RPROVIDES:kbd-legacy = "kbd-legacy ( =  2.6.4-7.el10)"

URI_kbd-misc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kbd-misc-2.6.4-7.el10.noarch.rpm;unpack=0"
RDEPENDS:kbd-misc = ""
RPROVIDES:kbd-misc = "kbd-misc ( =  2.6.4-7.el10)"
