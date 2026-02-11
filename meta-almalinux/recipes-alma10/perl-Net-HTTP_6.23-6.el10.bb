
PN = "perl-Net-HTTP"
PE = "0"
PV = "6.23"
PR = "6.el10"
PACKAGES = "perl-Net-HTTP perl-Net-HTTP-tests"


URI_perl-Net-HTTP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-HTTP-6.23-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-HTTP = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(base) ( ) perl(Symbol) ( ) perl(URI) ( ) perl(Compress::Raw::Zlib) ( ) perl(IO::Socket::IP) ( ) perl(IO::Uncompress::Gunzip) ( ) perl(Net::HTTP) ( ) perl(Net::HTTP::Methods) ( ) perl(IO::Socket::SSL) ( >=  2.012)"
RPROVIDES:perl-Net-HTTP = "perl(Net::HTTP) ( =  6.23) perl(Net::HTTP::Methods) ( =  6.23) perl(Net::HTTP::NB) ( =  6.23) perl(Net::HTTPS) ( =  6.23) perl-Net-HTTP ( =  6.23-6.el10)"

URI_perl-Net-HTTP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-HTTP-tests-6.23-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-HTTP-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(base) ( ) perl(Data::Dumper) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Socket) ( ) perl(IO::Socket::INET) ( ) perl(IO::Select) ( ) perl(Net::HTTP) ( ) perl(Net::HTTP::Methods) ( ) perl(Net::HTTP::NB) ( ) perl-Net-HTTP ( =  6.23-6.el10)"
RPROVIDES:perl-Net-HTTP-tests = "perl-Net-HTTP-tests ( =  6.23-6.el10)"
