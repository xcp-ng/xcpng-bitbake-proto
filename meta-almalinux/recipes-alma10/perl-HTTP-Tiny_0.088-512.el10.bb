
PN = "perl-HTTP-Tiny"
PE = "0"
PV = "0.088"
PR = "512.el10"
PACKAGES = "perl-HTTP-Tiny perl-HTTP-Tiny-tests"


URI_perl-HTTP-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Tiny-0.088-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Fcntl) ( ) perl(Socket) ( ) perl(bytes) ( ) perl(Errno) ( ) perl(IO::Socket) ( ) perl(MIME::Base64) ( ) perl(Time::Local) ( ) perl(Mozilla::CA) ( ) perl(IO::Socket::SSL) ( >=  1.56) perl(Net::SSLeay) ( >=  1.49)"
RPROVIDES:perl-HTTP-Tiny = "perl(HTTP::Tiny) ( =  0.088) perl-HTTP-Tiny ( =  0.088-512.el10)"

URI_perl-HTTP-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Tiny-tests-0.088-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(File::Temp) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Basename) ( ) perl(IO::File) ( ) perl(IO::Socket::INET) ( ) perl(open) ( ) openssl ( ) perl(IO::Dir) ( ) perl(IPC::Cmd) ( ) perl(Mozilla::CA) ( ) perl(HTTP::Tiny) ( ) perl(Test::More) ( >=  0.88) perl(Test::More) ( >=  0.96) perl(Test::More) ( >=  0.86) perl-HTTP-Tiny ( =  0.088-512.el10) perl(IO::Socket::SSL) ( >=  1.56) perl(Net::SSLeay) ( >=  1.49) perl(IO::Socket::IP) ( >=  0.32)"
RPROVIDES:perl-HTTP-Tiny-tests = "perl-HTTP-Tiny-tests ( =  0.088-512.el10)"
