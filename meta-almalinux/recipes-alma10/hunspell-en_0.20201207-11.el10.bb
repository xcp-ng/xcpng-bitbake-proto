
inherit dnf-bridge

PN = "hunspell-en"
PE = "0"
PV = "0.20201207"
PR = "11.el10"
PACKAGES = "hunspell-en hunspell-en-GB hunspell-en-US"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hunspell-en-0.20201207-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hunspell-en = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-en-0.20201207-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-en}"
RDEPENDS:hunspell-en = " \
 hunspell-en-GB \
 hunspell-en-US \
 hunspell \
"

URI_hunspell-en-GB = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-en-GB-0.20201207-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-en-GB}"
RDEPENDS:hunspell-en-GB = " \
 hunspell-filesystem \
 hunspell \
"

URI_hunspell-en-US = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-en-US-0.20201207-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hunspell-en-US}"
RDEPENDS:hunspell-en-US = " \
 hunspell-filesystem \
 hunspell \
"
