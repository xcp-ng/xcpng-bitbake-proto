
PN = "rubygem-nokogiri"
PE = "0"
PV = "1.16.4"
PR = "3.el10"
PACKAGES = "rubygem-nokogiri rubygem-nokogiri-doc"


URI_rubygem-nokogiri = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-nokogiri-1.16.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-nokogiri = "
 libxslt
 rubygem-racc
 ruby
 libxml2
 rubygems
 ruby-libs
 glibc
 coreutils
"

URI_rubygem-nokogiri-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-nokogiri-doc-1.16.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-nokogiri-doc = "
 rubygem-nokogiri
"
