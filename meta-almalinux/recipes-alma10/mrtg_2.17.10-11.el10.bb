
PN = "mrtg"
PE = "0"
PV = "2.17.10"
PR = "11.el10"
PACKAGES = "mrtg mrtg-selinux"


URI_mrtg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mrtg-2.17.10-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mrtg = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) perl(strict) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(POSIX) ( ) perl(Getopt::Long) ( ) perl(lib) ( ) perl(Socket) ( ) perl(IO::Socket) ( ) perl(Pod::Usage) ( ) libgd.so.3()(64bit) ( ) perl-locale ( ) perl(Math::BigFloat) ( ) gd ( ) perl(CGI) ( ) perl(BER) ( ) perl(FindBin) ( ) perl(SNMP_Session) ( ) perl-IO-Socket-INET6 ( ) perl-Socket6 ( ) perl(GIFgraph) ( ) perl(MRTG_lib) ( ) perl(locales_mrtg) ( ) perl(:VERSION) ( >=  5.5.0) perl(:VERSION) ( >=  5.4.0) perl(:VERSION) ( >=  5.2.0) mrtg-selinux ( if  selinux-policy-targeted)"
RPROVIDES:mrtg = "perl(GIFgraph::area) ( ) perl(GIFgraph::axestype) ( ) perl(GIFgraph::bars) ( ) perl(GIFgraph::colour) ( ) perl(GIFgraph::legend) ( ) perl(GIFgraph::lines) ( ) perl(GIFgraph::linespoints) ( ) perl(GIFgraph::mixed) ( ) perl(GIFgraph::pie) ( ) perl(GIFgraph::points) ( ) perl(GIFgraph::utils) ( ) config(mrtg) ( =  2.17.10-11.el10) mrtg ( =  2.17.10-11.el10) mrtg(x86-64) ( =  2.17.10-11.el10) perl(GIFgraph) ( =  1.10) perl(GIFgraph::EvenlySpaced) ( =  1.0) perl(GIFgraph::WithMap) ( =  1.0) perl(MRTG_lib) ( =  0003) perl(Net_SNMP_util) ( =  1.0.20) perl(locales_mrtg) ( =  0.07) perl(ovmrtg) ( =  0.00)"

URI_mrtg-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mrtg-selinux-2.17.10-11.el10.noarch.rpm;unpack=0"
RDEPENDS:mrtg-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.25) selinux-policy ( >=  40.13.25)"
RPROVIDES:mrtg-selinux = "mrtg-selinux ( =  2.17.10-11.el10)"
