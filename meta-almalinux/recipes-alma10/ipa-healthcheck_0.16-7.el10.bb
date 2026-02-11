
PN = "ipa-healthcheck"
PE = "0"
PV = "0.16"
PR = "7.el10"
PACKAGES = "ipa-healthcheck ipa-healthcheck-core"


URI_ipa-healthcheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-healthcheck-0.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ipa-healthcheck = "
 python3
 logrotate
 ipa-server
 systemd
 cronie-anacron
 python3-lib389
 python3-ipalib
 python3-ipaserver
 bash
 ipa-healthcheck-core
"

URI_ipa-healthcheck-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-healthcheck-core-0.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:ipa-healthcheck-core = "
 python3
"
