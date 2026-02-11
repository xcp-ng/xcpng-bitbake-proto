
PN = "zsh"
PE = "0"
PV = "5.9"
PR = "15.el10"
PACKAGES = "zsh zsh-html"


URI_zsh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zsh-5.9-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zsh = "/bin/sh ( ) grep ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libncursesw.so.6()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( )"
RPROVIDES:zsh = "/bin/zsh ( ) config(zsh) ( =  5.9-15.el10) zsh ( =  5.9-15.el10) zsh(x86-64) ( =  5.9-15.el10)"

URI_zsh-html = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/zsh-html-5.9-15.el10.noarch.rpm;unpack=0"
RDEPENDS:zsh-html = ""
RPROVIDES:zsh-html = "zsh-html ( =  5.9-15.el10)"
