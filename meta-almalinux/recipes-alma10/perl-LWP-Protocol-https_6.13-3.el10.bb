
PN = "perl-LWP-Protocol-https"
PE = "0"
PV = "6.13"
PR = "3.el10"
PACKAGES = "perl-LWP-Protocol-https perl-LWP-Protocol-https-tests"


URI_perl-LWP-Protocol-https = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-LWP-Protocol-https-6.13-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-Protocol-https = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(base) ( ) perl(LWP::Protocol::http) ( ) perl(LWP::Protocol::http::SocketMethods) ( ) perl(IO::Socket::SSL) ( >=  1.54) perl(Mozilla::CA) ( >=  20180117) perl(Net::HTTPS) ( >=  6)"
RPROVIDES:perl-LWP-Protocol-https = "perl(LWP::Protocol::https::Socket) ( ) perl(LWP::Protocol::https) ( =  6.13) perl-LWP-Protocol-https ( =  6.13-3.el10)"

URI_perl-LWP-Protocol-https-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-LWP-Protocol-https-tests-6.13-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-Protocol-https-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Temp) ( ) perl(Socket) ( ) perl(IO::Socket::INET) ( ) perl(IO::Select) ( ) perl(Test::Needs) ( ) perl(Try::Tiny) ( ) perl(IO::Socket::SSL) ( ) perl(LWP::UserAgent) ( ) perl(IO::Socket::SSL::Utils) ( ) perl(LWP::Protocol::https) ( ) perl-LWP-Protocol-https ( =  6.13-3.el10)"
RPROVIDES:perl-LWP-Protocol-https-tests = "perl-LWP-Protocol-https-tests ( =  6.13-3.el10)"
