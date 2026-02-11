
PN = "perl-HTTP-Daemon"
PE = "0"
PV = "6.16"
PR = "7.el10"
PACKAGES = "perl-HTTP-Daemon perl-HTTP-Daemon-tests"


URI_perl-HTTP-Daemon = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-HTTP-Daemon-6.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Daemon = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Socket) ( ) perl(HTTP::Date) ( >=  6) perl(LWP::MediaTypes) ( >=  6) perl(IO::Socket::IP) ( >=  0.32) perl(HTTP::Request) ( >=  6) perl(HTTP::Response) ( >=  6) perl(HTTP::Status) ( >=  6)"
RPROVIDES:perl-HTTP-Daemon = "perl(HTTP::Daemon) ( =  6.16) perl-HTTP-Daemon ( =  6.16-7.el10)"

URI_perl-HTTP-Daemon-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Daemon-tests-6.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Daemon-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(File::Temp) ( ) perl(Socket) ( ) perl(MIME::Base64) ( ) perl(IO::Select) ( ) perl(Test::Needs) ( ) perl(Module::Metadata) ( ) perl(HTTP::Daemon) ( ) perl(LWP::RobotUA) ( ) perl(Test::More) ( >=  0.98) perl-HTTP-Daemon ( =  6.16-7.el10) perl(LWP::UserAgent) ( >=  6.37)"
RPROVIDES:perl-HTTP-Daemon-tests = "perl-HTTP-Daemon-tests ( =  6.16-7.el10)"
