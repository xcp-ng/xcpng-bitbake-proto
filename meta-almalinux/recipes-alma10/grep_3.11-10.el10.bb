
PN = "grep"
PE = "0"
PV = "3.11"
PR = "10.el10"
PACKAGES = "grep"


URI_grep = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grep-3.11-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:grep = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libpcre2-8.so.0()(64bit) ( )"
RPROVIDES:grep = "bundled(gnulib) ( ) /bin/egrep ( ) /bin/fgrep ( ) /bin/grep ( ) config(grep) ( =  3.11-10.el10) grep ( =  3.11-10.el10) grep(x86-64) ( =  3.11-10.el10)"
