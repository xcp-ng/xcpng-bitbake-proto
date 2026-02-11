
PN = "hspell"
PE = "0"
PV = "1.4"
PR = "23.el10"
PACKAGES = "hunspell-he hspell hspell-devel"


URI_hunspell-he = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-he-1.4-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell-he = "hunspell ( )"
RPROVIDES:hunspell-he = "hunspell-he ( =  1.4-23.el10) hunspell-he(x86-64) ( =  1.4-23.el10)"

URI_hspell = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hspell-1.4-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hspell = "rtld(GNU_HASH) ( ) perl(strict) ( ) /usr/bin/perl ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) perl(IO::Handle) ( ) perl(Getopt::Long) ( ) perl(IPC::Open2) ( )"
RPROVIDES:hspell = "libhspell.so.0()(64bit) ( ) hspell ( =  1.4-23.el10) hspell(x86-64) ( =  1.4-23.el10)"

URI_hspell-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hspell-devel-1.4-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hspell-devel = "libhspell.so.0()(64bit) ( ) hspell ( =  1.4-23.el10)"
RPROVIDES:hspell-devel = "hspell-devel ( =  1.4-23.el10) hspell-devel(x86-64) ( =  1.4-23.el10)"
