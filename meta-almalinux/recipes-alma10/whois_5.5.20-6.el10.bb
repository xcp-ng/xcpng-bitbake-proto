
PN = "whois"
PE = "0"
PV = "5.5.20"
PR = "6.el10"
PACKAGES = "mkpasswd whois whois-nls"


URI_mkpasswd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mkpasswd-5.5.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mkpasswd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) whois-nls ( =  5.5.20-6.el10)"
RPROVIDES:mkpasswd = "mkpasswd ( =  5.5.20-6.el10) mkpasswd(x86-64) ( =  5.5.20-6.el10) whois-mkpasswd ( =  5.5.20-6.el10)"

URI_whois = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/whois-5.5.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:whois = "/bin/sh ( ) /usr/sbin/update-alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) whois-nls ( =  5.5.20-6.el10)"
RPROVIDES:whois = "config(whois) ( =  5.5.20-6.el10) whois ( =  5.5.20-6.el10) whois(x86-64) ( =  5.5.20-6.el10)"

URI_whois-nls = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/whois-nls-5.5.20-6.el10.noarch.rpm;unpack=0"
RDEPENDS:whois-nls = ""
RPROVIDES:whois-nls = "whois-nls ( =  5.5.20-6.el10)"
