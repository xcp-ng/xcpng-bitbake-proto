
PN = "tftp"
PE = "0"
PV = "5.2"
PR = "48.el10"
PACKAGES = "tftp tftp-server"


URI_tftp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tftp-5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tftp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( )"
RPROVIDES:tftp = "tftp ( =  5.2-48.el10) tftp(x86-64) ( =  5.2-48.el10)"

URI_tftp-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tftp-server-5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tftp-server = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:tftp-server = "tftp-server ( =  5.2-48.el10) tftp-server(x86-64) ( =  5.2-48.el10)"
