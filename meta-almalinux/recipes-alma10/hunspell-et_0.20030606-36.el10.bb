
PN = "hunspell-et"
PE = "0"
PV = "0.20030606"
PR = "36.el10"
PACKAGES = "hunspell-et hyphen-et"


URI_hunspell-et = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-et-0.20030606-36.el10.noarch.rpm;unpack=0"
RDEPENDS:hunspell-et = "hunspell-filesystem ( )"
RPROVIDES:hunspell-et = "hunspell-ee ( =  0.20030606-4) hunspell-et ( =  0.20030606-36.el10)"

URI_hyphen-et = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-et-0.20030606-36.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-et = "hyphen ( )"
RPROVIDES:hyphen-et = "hyphen-et ( =  0.20030606-36.el10)"
