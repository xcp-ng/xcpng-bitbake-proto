
PN = "gawk"
PE = "0"
PV = "5.3.0"
PR = "6.el10"
PACKAGES = "gawk gawk-all-langpacks gawk-devel gawk-doc"


URI_gawk = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gawk-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gawk = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) filesystem ( >=  3)"
RPROVIDES:gawk = "/bin/awk ( ) /bin/gawk ( ) gawk ( =  5.3.0-6.el10) gawk(abi) ( =  4.0) gawk(x86-64) ( =  5.3.0-6.el10)"

URI_gawk-all-langpacks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gawk-all-langpacks-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gawk-all-langpacks = ""
RPROVIDES:gawk-all-langpacks = "gawk-all-langpacks ( =  5.3.0-6.el10) gawk-all-langpacks(x86-64) ( =  5.3.0-6.el10)"

URI_gawk-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gawk-devel-5.3.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gawk-devel = "gawk(x86-64) ( =  5.3.0-6.el10)"
RPROVIDES:gawk-devel = "gawk-devel ( =  5.3.0-6.el10) gawk-devel(x86-64) ( =  5.3.0-6.el10)"

URI_gawk-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gawk-doc-5.3.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:gawk-doc = "gawk ( =  5.3.0-6.el10)"
RPROVIDES:gawk-doc = "gawk-doc ( =  5.3.0-6.el10)"
