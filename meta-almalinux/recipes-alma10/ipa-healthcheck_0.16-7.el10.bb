
PN = "ipa-healthcheck"
PE = "0"
PV = "0.16"
PR = "7.el10"
PACKAGES = "ipa-healthcheck ipa-healthcheck-core"


URI_ipa-healthcheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-healthcheck-0.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ipa-healthcheck = "/bin/sh ( ) systemd ( ) systemd-units ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) logrotate ( ) ipa-server ( ) python3-ipalib ( ) python3-ipaserver ( ) anacron ( ) python(abi) ( =  3.12) ipa-healthcheck-core ( =  0.16-7.el10) python3-lib389 ( >=  1.4.2.14-1)"
RPROVIDES:ipa-healthcheck = "config(ipa-healthcheck) ( =  0.16-7.el10) freeipa-healthcheck ( =  0.16) ipa-healthcheck ( =  0.16-7.el10) python3.12dist(ipahealthcheck) ( =  0.16) python3dist(ipahealthcheck) ( =  0.16)"

URI_ipa-healthcheck-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-healthcheck-core-0.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ipa-healthcheck-core = "python(abi) ( =  3.12)"
RPROVIDES:ipa-healthcheck-core = "ipa-healthcheck-core ( =  0.16-7.el10) freeipa-healthcheck-core ( =  0.16)"
