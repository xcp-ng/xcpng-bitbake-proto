
PN = "perl-IO-Socket-IP"
PE = "0"
PV = "0.42"
PR = "512.el10"
PACKAGES = "perl-IO-Socket-IP perl-IO-Socket-IP-tests"


URI_perl-IO-Socket-IP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Socket-IP-0.42-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Socket-IP = "perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(base) ( ) perl(Errno) ( ) perl(IO::Socket) ( ) perl(:VERSION) ( >=  5.14.0) perl(Socket) ( >=  1.97)"
RPROVIDES:perl-IO-Socket-IP = "perl(IO::Socket::IP) ( =  0.42) perl-IO-Socket-IP ( =  0.42-512.el10)"

URI_perl-IO-Socket-IP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Socket-IP-tests-0.42-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Socket-IP-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(base) ( ) perl(IO::Socket::INET) ( ) perl(Errno) ( ) perl(IO::Socket) ( ) perl(IO::Socket::IP) ( ) perl(:VERSION) ( >=  5.14.0) perl-IO-Socket-IP ( =  0.42-512.el10) perl(Socket) ( >=  1.95)"
RPROVIDES:perl-IO-Socket-IP-tests = "perl-IO-Socket-IP-tests ( =  0.42-512.el10)"
