
PN = "readline"
PE = "0"
PV = "8.2"
PR = "11.el10"
PACKAGES = "readline readline-devel readline-static"


URI_readline = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/readline-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtinfo.so.6()(64bit) ( )"
RPROVIDES:readline = "libreadline.so.8()(64bit) ( ) libhistory.so.8()(64bit) ( ) readline ( =  8.2-11.el10) readline(x86-64) ( =  8.2-11.el10)"

URI_readline-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/readline-devel-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline-devel = "/usr/bin/pkg-config ( ) libreadline.so.8()(64bit) ( ) pkgconfig(ncurses) ( ) libhistory.so.8()(64bit) ( ) readline(x86-64) ( =  8.2-11.el10)"
RPROVIDES:readline-devel = "pkgconfig(history) ( =  8.2) pkgconfig(readline) ( =  8.2) readline-devel ( =  8.2-11.el10) readline-devel(x86-64) ( =  8.2-11.el10)"

URI_readline-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/readline-static-8.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:readline-static = "readline-devel(x86-64) ( =  8.2-11.el10)"
RPROVIDES:readline-static = "readline-static ( =  8.2-11.el10) readline-static(x86-64) ( =  8.2-11.el10)"
