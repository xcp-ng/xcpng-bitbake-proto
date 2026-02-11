
PN = "pptp"
PE = "0"
PV = "1.10.0"
PR = "22.el10"
PACKAGES = "pptp pptp-setup"


URI_pptp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pptp-1.10.0-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pptp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) systemd-units ( ) /sbin/ip ( ) ppp ( >=  2.4.2)"
RPROVIDES:pptp = "config(pptp) ( =  1.10.0-22.el10) pptp ( =  1.10.0-22.el10) pptp(x86-64) ( =  1.10.0-22.el10)"

URI_pptp-setup = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pptp-setup-1.10.0-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pptp-setup = "perl(strict) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Getopt::Long) ( ) pptp ( =  1.10.0-22.el10)"
RPROVIDES:pptp-setup = "pptp-setup ( =  1.10.0-22.el10) pptp-setup(x86-64) ( =  1.10.0-22.el10)"
