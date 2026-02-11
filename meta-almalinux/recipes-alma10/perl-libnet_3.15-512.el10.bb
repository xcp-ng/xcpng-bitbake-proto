
PN = "perl-libnet"
PE = "0"
PV = "3.15"
PR = "512.el10"
PACKAGES = "perl-libnet perl-libnet-tests"


URI_perl-libnet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libnet-3.15-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libnet = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(Symbol) ( ) perl(Errno) ( ) perl(Digest::MD5) ( ) perl(Time::Local) ( ) perl(FileHandle) ( ) perl(IO::Select) ( ) perl(Net::Config) ( ) perl(Net::Cmd) ( ) perl(Net::FTP::I) ( ) perl(Net::FTP::dataconn) ( ) perl(:VERSION) ( >=  5.8.1) perl(IO::Socket) ( >=  1.05) perl(IO::Socket::IP) ( >=  0.25) perl(Socket) ( >=  2.016)"
RPROVIDES:perl-libnet = "perl(Net::NNTP::_SSL) ( ) perl(Net::POP3::_SSL) ( ) perl(Net::SMTP::_SSL) ( ) perl(Net::Cmd) ( =  3.15) perl(Net::Config) ( =  3.15) perl(Net::Domain) ( =  3.15) perl(Net::FTP) ( =  3.15) perl(Net::FTP::A) ( =  3.15) perl(Net::FTP::E) ( =  3.15) perl(Net::FTP::I) ( =  3.15) perl(Net::FTP::L) ( =  3.15) perl(Net::FTP::dataconn) ( =  3.15) perl(Net::NNTP) ( =  3.15) perl(Net::Netrc) ( =  3.15) perl(Net::POP3) ( =  3.15) perl(Net::SMTP) ( =  3.15) perl(Net::Time) ( =  3.15) perl-libnet ( =  3.15-512.el10)"

URI_perl-libnet-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-libnet-tests-3.15-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libnet-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(IO::File) ( ) perl(IO::Socket::INET) ( ) perl(IO::Socket::SSL) ( ) perl(IO::Socket::SSL::Utils) ( ) perl(Net::Domain) ( ) perl(Net::FTP) ( ) perl(Net::Cmd) ( ) perl(Net::Config) ( ) perl(Net::NNTP) ( ) perl(Net::POP3) ( ) perl(Net::SMTP) ( ) perl(:VERSION) ( >=  5.8.1) perl-libnet ( =  3.15-512.el10)"
RPROVIDES:perl-libnet-tests = "perl-libnet-tests ( =  3.15-512.el10)"
