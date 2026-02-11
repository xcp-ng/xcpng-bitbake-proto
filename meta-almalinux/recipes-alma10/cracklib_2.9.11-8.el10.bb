
PN = "cracklib"
PE = "0"
PV = "2.9.11"
PR = "8.el10"
PACKAGES = "cracklib cracklib-dicts cracklib-devel"


URI_cracklib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cracklib-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cracklib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) gzip ( )"
RPROVIDES:cracklib = "libcrack.so.2()(64bit) ( ) cracklib ( =  2.9.11-8.el10) cracklib(x86-64) ( =  2.9.11-8.el10)"

URI_cracklib-dicts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cracklib-dicts-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cracklib-dicts = "cracklib ( =  2.9.11-8.el10)"
RPROVIDES:cracklib-dicts = "cracklib-dicts ( =  2.9.11-8.el10) cracklib-dicts(x86-64) ( =  2.9.11-8.el10)"

URI_cracklib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cracklib-devel-2.9.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cracklib-devel = "libcrack.so.2()(64bit) ( ) cracklib(x86-64) ( =  2.9.11-8.el10)"
RPROVIDES:cracklib-devel = "cracklib-devel ( =  2.9.11-8.el10) cracklib-devel(x86-64) ( =  2.9.11-8.el10)"
