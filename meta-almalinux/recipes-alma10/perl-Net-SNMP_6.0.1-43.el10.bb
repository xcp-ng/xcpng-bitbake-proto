
PN = "perl-Net-SNMP"
PE = "0"
PV = "6.0.1"
PR = "43.el10"
PACKAGES = "perl-Net-SNMP perl-Net-SNMP-tests"


URI_perl-Net-SNMP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SNMP-6.0.1-43.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SNMP = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(base) ( ) perl(Socket) ( ) perl(bytes) ( ) perl(Errno) ( ) perl(IO::Socket) ( ) perl(Digest::SHA) ( ) perl(Math::BigInt) ( ) perl(Net::SNMP::Dispatcher) ( ) perl(Net::SNMP::Message) ( ) perl(Net::SNMP::MessageProcessing) ( ) perl(Net::SNMP::PDU) ( ) perl(Net::SNMP::Security) ( ) perl(Net::SNMP::Transport) ( ) perl(Net::SNMP::Transport::IPv4) ( ) perl(Net::SNMP::Transport::IPv4::TCP) ( ) perl(Net::SNMP::Transport::IPv4::UDP) ( ) perl(Net::SNMP::Transport::IPv6) ( ) perl(Crypt::DES) ( >=  2.03) perl(Digest::HMAC_MD5) ( >=  1.01) perl(Digest::HMAC_SHA1) ( >=  1.03) perl(Digest::MD5) ( >=  2.11) perl(Net::SNMP::Security::USM) ( >=  4.0)"
RPROVIDES:perl-Net-SNMP = "perl(Net::SNMP) ( =  6.0.1) perl(Net::SNMP::Dispatcher) ( =  4.0.1) perl(Net::SNMP::Message) ( =  3.0.1) perl(Net::SNMP::MessageProcessing) ( =  3.0.1) perl(Net::SNMP::PDU) ( =  3.0.1) perl(Net::SNMP::Security) ( =  2.0.0) perl(Net::SNMP::Security::Community) ( =  2.0.0) perl(Net::SNMP::Security::USM) ( =  4.0.1) perl(Net::SNMP::Transport) ( =  3.0.0) perl(Net::SNMP::Transport::IPv4) ( =  1.0.0) perl(Net::SNMP::Transport::IPv4::TCP) ( =  3.0.0) perl(Net::SNMP::Transport::IPv4::UDP) ( =  4.0.0) perl(Net::SNMP::Transport::IPv6) ( =  1.0.0) perl(Net::SNMP::Transport::IPv6::TCP) ( =  3.0.0) perl(Net::SNMP::Transport::IPv6::UDP) ( =  3.0.0) perl-Net-SNMP ( =  6.0.1-43.el10)"

URI_perl-Net-SNMP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SNMP-tests-6.0.1-43.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SNMP-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(Net::SNMP::Dispatcher) ( ) perl(Net::SNMP::Message) ( ) perl(Net::SNMP::MessageProcessing) ( ) perl(Net::SNMP::PDU) ( ) perl(Net::SNMP::Security) ( ) perl(Net::SNMP::Transport) ( ) perl-Net-SNMP ( =  6.0.1-43.el10)"
RPROVIDES:perl-Net-SNMP-tests = "perl-Net-SNMP-tests ( =  6.0.1-43.el10)"
