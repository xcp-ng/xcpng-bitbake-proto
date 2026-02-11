
PN = "rasdaemon"
PE = "0"
PV = "0.8.0"
PR = "8.el10"
PACKAGES = "rasdaemon"


URI_rasdaemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rasdaemon-0.8.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rasdaemon = "systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) perl(strict) ( ) /usr/bin/perl ( ) libtraceevent.so.1()(64bit) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) libsqlite3.so.0()(64bit) ( ) perl(File::Find) ( ) libtraceevent ( ) hwdata ( ) dmidecode ( ) perl-DBD-SQLite ( )"
RPROVIDES:rasdaemon = "bundled(kernel-event-lib) ( ) config(rasdaemon) ( =  0.8.0-8.el10) rasdaemon ( =  0.8.0-8.el10) rasdaemon(x86-64) ( =  0.8.0-8.el10)"
